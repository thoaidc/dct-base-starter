package com.dct.config.exception;

import com.dct.model.common.MessageTranslationUtils;

public class DefaultBaseExceptionHandler extends BaseExceptionHandler {

    public DefaultBaseExceptionHandler() {
        super();
    }

    public DefaultBaseExceptionHandler(MessageTranslationUtils messageTranslationUtils) {
        super(messageTranslationUtils);
    }
}
