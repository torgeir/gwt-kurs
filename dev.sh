#!/bin/sh
dir=/cygdrive/d/torgeir/privat/workspaces/java/GwtWorkshopTelenor
echo dir=$dir
cp=$dir/src:$dir/lib/gwt-user.jar:$dir/lib/gwt-dev.jar
echo cp=$cp
mainClass=com.google.gwt.dev.DevMode
echo mainClass=$mainClass
war=/tmp/gwtExplodedWebApps/mod1
echo war=$war
startupUrl=gwtWorkshop.mod1.Mod1/Mod1.html
echo startupUrl=$startupUrl
java -Xmx512m -classpath $cp $mainClass -war $war -startupUrl $startupUrl gwtWorkshop.mod1.Mod1