set cp=src;lib\gwt-user.jar;lib\gwt-dev.jar
set mainClass=com.google.gwt.dev.DevMode
set war=tmp\
set startupUrl=gwtWorkshop.mod1.Mod1/Mod1.html
java -Xmx512m -classpath %cp% %mainClass% -war %war% -startupUrl %startupUrl% gwtWorkshop.mod1.Mod1