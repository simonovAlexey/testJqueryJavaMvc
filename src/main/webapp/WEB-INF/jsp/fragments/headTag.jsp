<%@page contentType="text/html" pageEncoding="UTF-8" %>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Test Jquery Java MVC</title>
    <base href="${pageContext.request.contextPath}/"/>

    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/2.8.0/css/flag-icon.css" rel="stylesheet"/>

    <script type="text/javascript" src="resources/js/script.js" defer></script>
    <script type="text/javascript" src="webjars/jquery/3.2.0/jquery.min.js"></script>
    <script type="text/javascript" src="webjars/jquery-ui/1.12.1/jquery-ui.min.js"></script>
    <script type="text/javascript" src="webjars/github-com-jquery-i18n-properties-jquery-i18n-properties-\1.2.3\jquery.i18n.properties.js" defer></script>
    <script type="text/javascript" src="webjars/js-cookie/2.1.4/src/js.cookie.js" defer></script>

    <style>
        /* Select flags, dynamic url not work in .css files */

        .ui-icon.en {
            background: url(/resources/images/flag-uk.png) 0 0 no-repeat;
        }
        .ui-icon.ru {
            background: url(/resources/images/flag-ru.png) 0 0 no-repeat;
        }
        .ui-icon.blank {
            background: url(/resources/images/1x1.png) 0 0 no-repeat;
        }
    </style>

    <script>
        var localeCode="${pageContext.response.locale}";
    </script>

</head>