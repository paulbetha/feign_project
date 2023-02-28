Feign is a declarative web service client. It makes writing web service clients easier. 
To use Feign create an interface and annotate it. 
It has pluggable annotation support including Feign annotations and JAX-RS annotations. 
Feign also supports pluggable encoders and decoders.


There are two projects in this :

Run both as two different springboot apps - 8081 ( with a general rest controller)
8082( With feign client which tries to access the service in 8081)

