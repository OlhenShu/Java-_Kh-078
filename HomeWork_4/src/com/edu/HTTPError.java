package com.edu;

public enum HTTPError {
    ERROR_400("Bad Request"),
    ERROR_401("Unauthorized"),
    ERROR_402("Payment Required"),
    ERROR_403("Forbidden"),
    ERROR_404("Not Found"),
    ERROR_405("Method Not Allowed"),
    ERROR_406("Not Acceptable"),
    ERROR_407("Proxy Authentication Required"),
    ERROR_408("Request Timeout"),
    ERROR_409("Conflict"),
    ERROR_410("Gone"),
    ERROR_411("Length Required"),
    ERROR_412("Precondition Failed"),
    ERROR_413("Request Entity Too Large"),
    ERROR_414("Request-URI Too Long"),
    ERROR_415("Unsupported Media Type"),
    ERROR_416("Requested Range Not Satisfiable"),
    ERROR_417("Expectation Failed"),
    ERROR_500("Internal Server Error"),
    ERROR_501("Not Implemented"),
    ERROR_502("Bad Gateway"),
    ERROR_503("Service Unavailable"),
    ERROR_504("Gateway Timeout"),
    ERROR_505("HTTP Version Not Supported");
    private final String errorName;

    HTTPError(String errorName) {
        this.errorName = errorName;
    }

    public String getErrorName() {
        return errorName;
    }
}
