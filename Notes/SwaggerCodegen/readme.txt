edit myOptions.json

Then execute:

java -jar swagger-codegen-cli-2.4.9.jar generate -l spring -c myOptions.json -v -i "G:\Shared drives\NAM Research\SDN-NFV\TMFORUM\OpenAPIs\Resource_Catalog\TMF634_Resource_Catalog_Management.admin.swagger-R17.0.0.json" -o "G:\Shared drives\NAM Research\SDN-NFV\TMFORUM\OpenAPIs\Resource_Catalog\code" 

NEWER:
"c:\Program Files\AdoptOpenJDK\jdk-13.0.2.8-openj9\bin\java.exe" -jar swagger-codegen-cli-3.0.19.jar generate -l spring -c myOptions.json -v -i "G:\Shared drives\openslice\works\TMFORUM\OpenAPIs\Product_Ordering\Product_Ordering.regular.swagger.json" -o "G:\Shared drives\openslice\works\TMFORUM\OpenAPIs\Product_Ordering\code"

"c:\Program Files\AdoptOpenJDK\jdk-13.0.2.8-openj9\bin\java.exe" -jar swagger-codegen-cli-3.0.19.jar generate -l spring -c myOptions.json -v -i "G:\Shared drives\openslice\works\TMFORUM\OpenAPIs\Service Test Management\TMF653-ServiceTest-v4.0.0.swagger.json" -o "G:\Shared drives\openslice\works\TMFORUM\OpenAPIs\Service Test Management\code"


sudo java -jar swagger-codegen-cli-3.0.19.jar generate -l spring -c myOptions.json -v -i /home/gctz/Desktop/Diplwmatikh/Multi_TS/TS29571_CommonData.yaml -o /home/gctz/Desktop/Diplwmatikh/Multi_TS/CommonData

sudo java -jar swagger-codegen-cli-3.0.19.jar generate -l spring -c myOptions.json -v -i /home/comlab/NWDAF-NEW/Needed_Yaml_Files/TS29520_Nnwdaf_AnalyticsInfo.yaml -o /home/comlab/NWDAF-NEW/AnalyticsInfoAPI
