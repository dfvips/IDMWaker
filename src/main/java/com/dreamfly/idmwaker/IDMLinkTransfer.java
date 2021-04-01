package com.dreamfly.idmwaker;

import java.io.IOException;

/**
 * IDMWaker
 *
 * @author dreamfly
 * @since 2021年04月01日 22:50
 */
public class IDMLinkTransfer {
    public IDMLinkTransfer(String URL,//URL
                           String Referer, //Referer
                           String Cookies, //Cookies
                           String Data, //Data
                           String Username, //Username
                           String Userpassword, //Userpassword
                           String LocalPath, //LocalPath
                           String LocalFileName,  //LocalFileName
                           int Flag, //Flag 1 or 2 .One means a confirmation window will pop up and Two means silence.
                           Object UserAgent,//UserAgent,
                           Object Other
    ) {
        ICIDMLinkTransmitter2 idms = ClassFactory.createCIDMLinkTransmitter();
        idms.sendLinkToIDM2(URL, Referer, Cookies, Data, Username, Userpassword, LocalPath, LocalFileName, Flag, UserAgent, Other);
    }

    public static void main(String arg[]) throws IOException {
        new IDMLinkTransfer("https://www.baidu.com", "", "", "", "", "", "C:\\Users\\dreamfly\\Desktop", "baidu.html", 1, null, null);
    }
}