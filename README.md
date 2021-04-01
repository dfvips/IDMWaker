# IDMWaker With Java
 Java调用IDM的api添加任务
 
## 功能描述
通过com4j将链接批量发送给IDM进行下载
## 实现方式
<p>1.<a href="http://www.internetdownloadmanager.com/support/download/IDMCOMAPI.zip" rel="nofollow">下载API</a></p>
<p>2.通过使用com4j中的TlbImp.jar将IDManTypeInfo.tlb文件转换为ClassFactory、ICIDMLinkTransmitter。</p>
<p>3.关键调用方法
 <pre><code> IDMLinkTransfer(String URL,//URL
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
    );
</code></pre></p>
## <a href="https://github.com/nilaoda/IDMWaker" rel="nofollow">C#和GUI版指引</a>
## <a href="https://github.com/kohsuke/com4j" rel="nofollow">com4j指引</a>
