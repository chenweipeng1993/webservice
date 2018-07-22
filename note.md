XML. Extensible Markup Language －扩展性标记语言 
WSDL – WebService Description Language – Web服务描述语言。
SOAP-Simple Object Access Protocol(简单对象访问协议)
Webservice服务网站：http://www.webxml.com.cn
Wsdl文档从下往上读
http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl
从下往上读WSDL文档，先找到Services（服务访问点集合），根据Services里面binding属性找到binding元素，再根据binding元素的type属性找到绑定的portType（服务类）
