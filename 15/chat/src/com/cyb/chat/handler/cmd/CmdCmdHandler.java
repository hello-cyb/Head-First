package com.cyb.chat.handler.cmd;

import com.cyb.chat.entity.User;

/**
 * @author Cyb
 * 命令行处理类
 */
public class CmdCmdHandler extends BaseCmdHandler {
    private static final String KEY = "$chat";

    public CmdCmdHandler(BaseCmdHandler baseCmdHandler) {
        super(baseCmdHandler);
    }

    @Override
    public void handlerResult(User user, String msg) {
        if (msg.startsWith(KEY)) {
            user.tellCmd(msg);
        } else {
            if (super.baseCmdHandler != null) {
                super.baseCmdHandler.handlerResult(user, msg);
            }
        }
    }


}
