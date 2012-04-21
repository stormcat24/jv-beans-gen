%~d0
cd %~p0
cmd /k mvn -e pre-clean eclipse:eclipse -DdownloadSources=true