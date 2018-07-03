手写小型tomcat
====
了解：
----
`协议：`<br>
*1：应用层 HTTP FTP DNS ...<br>
*2：传输层 TCP UDP<br>
*3：网络层 IP<br>
*4：主机-网络层 以太网 令牌环网<br>
HTTP（超文本传输协议）是网络应用层的协议，建立在TCP/IP协议基础上，HTTP协议使用可靠的TCP连接。
 
用户打开WEB浏览器，输入URL地址，就能接收到远程HTTP服务端发送过来的网页，即HTTP遵循请求（Request）/应答（Response）模型。所有的HTTP连接都是被构造成一套请求和应答。
正常情况下HTTP客户端浏览器已经帮我们做好了，我们只要遵循HTTP协议，就可以解析Request请求并返回HTTP响应的数据格式Response.
