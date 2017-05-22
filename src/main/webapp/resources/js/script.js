// Get the modal
var modal1 = document.getElementById('loginForm');
var modal2 = document.getElementById('pageContainer');

// on page load
$(function () {

    changeLang("en_US");

    var langC = Cookies.get('langC');
    if (Cookies.get('loginC') == null) modal1.style.display = 'block'; else
        getProfile();

});

/*// When the user clicks anywhere outside of the modal1, close it
 window.onclick = function (event) {
 if (event.target == modal1) {
 modal1.style.display = "none";
 modal2.style.display = "block";

 }
 };*/

// flags for select
$(function () {
    $.widget("custom.iconselectmenu", $.ui.selectmenu, {
        _renderItem: function (ul, item) {
            var li = $("<li>"),
                wrapper = $("<div>", {text: item.label});

            if (item.disabled) {
                li.addClass("ui-state-disabled");
            }

            $("<span>", {
                style: item.element.attr("data-style"),
                "class": "ui-icon " + item.element.attr("data-class")
            })
                .appendTo(wrapper);

            return li.append(wrapper).appendTo(ul);
        }
    });

    $("#selectlang").iconselectmenu({
        change: function (event, ui) {
            var l = $("select#selectlang").val();
            if (l !== '') changeLang(l);
        }
    }).iconselectmenu("menuWidget").addClass("ui-menu-icons");

});


function getWelcomePage() {
    $.ajax({
        type: "POST",
        url: "checkCrendails",
        data: $('#detailsForm').serialize(),
        success: function (data) {
            $("#pageContainer").html(data);
            changeLang(appLang);
            modal1.style.display = "none";
            modal2.style.display = "block";
        },
        error: function (xhr, ajaxOptions, thrownError) {
            if (xhr.status && xhr.status == 422) {
                $("#showerror").html(msg_error);
            }
        }
    });
}
function getProfile() {
    $.ajax({
        type: "Get",
        url: "profile",
        success: function (data) {
            $("#pageContainer").html(data);
            if (langC == 'ru_RU') changeLang(langC);
            else changeLang("en_US");
            modal2.style.display = "block";
        }
    });
}

function changeLang(lang) {
    $.i18n.properties({
        name: 'Messages',
        path: 'resources/messages/',
        mode: 'both',
        language: lang,
        callback: function () {
            $("#msg_welcome").text($.i18n.prop('msg_welcome'));
            $("#msg_username").text($.i18n.prop('msg_username'));
            $("#msg_password").text($.i18n.prop('msg_password'));
            $("#msg_remember").text($.i18n.prop('msg_remember'));
            $("#msg_login").text($.i18n.prop('msg_login'));
            $("#msg_lang").text($.i18n.prop('msg_lang'));

            $("td#flag").attr("class", $.i18n.prop('flag'));
            $("#login").attr("placeholder", $.i18n.prop('msg_enter_username'));
            $("#password").attr("placeholder", $.i18n.prop('msg_enter_password'));

            $("#msg_u_welcome").text($.i18n.prop('msg_u_welcome'));
            $("#msg_u_your").text($.i18n.prop('msg_u_your'));
            $("#msg_u_lang").text($.i18n.prop('msg_u_lang'));
            $("#msg_u_logout").text($.i18n.prop('msg_u_logout'));

            $.i18n.prop('msg_error');

        }
    });
}

function clearCookies() {
    Object.keys(Cookies.get()).forEach(function (cookieName) {
        Cookies.remove(cookieName);
    });
}
