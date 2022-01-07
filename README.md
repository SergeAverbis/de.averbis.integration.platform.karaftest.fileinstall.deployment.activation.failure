# REPRODUCING BUNDLE DEPLOYMENT FAILURE (fileinstall)
installing docker

run the following commands
> docker rm -f karaftest_karaftest_1
>
> cd karaftest
>
> mvn clean install -DKARAF_VERSION=4.2.14
>
> docker exec -it karaftest_karaftest_1 client list | grep bundle
>
xx │ Resolved │ 80 │ 1.0.0 │ bundleimpl<br>
yy │ Active │ 80 │ 1.0.0 │ bundleapi<br>
====> the bundle 'bundleimpl' is not Active<br>
[karaf.log](./karaf.log)

RUN
> docker exec -it karaftest_karaftest_1 client start xx
>
OR
> docker restart karaftest_karaftest_1
>
THEN
> docker exec -it karaftest_karaftest_1 client list | grep bundle
>
xx │ Active │ 80 │ 1.0.0 │ bundleimpl<br>
xx │ Active │ 80 │ 1.0.0 │ bundleapi<br>
====> the bundle 'bundleimpl' is now Active<br>

if 'bundleimpl' is activated then run the following command until you see the result above
> docker exec -it karaftest_karaftest_1 rm -rf /opt/karaf/data && sleep 5 && docker start karaftest_karaftest_1 && sleep 5 && docker exec -it karaftest_karaftest_1 client list | grep bundle
>

## CONCLUSION

The first time activation of bundle doesn't work properly sometimes.
<br>

### KEY POINTS

The bundle 'bundleapi'

- is deployed in the standard directory 'deploy/'
- contains dummy files (ballast*) to make it big

The bundle 'bundleimpl'

- is deployed in a separate configured directory 'deploy2/'
- imports a package of '* :: bundleapi'

### REPRODUCED IN

Karaf 4.2.14 4.2.13 4.2.12 4.2.11 4.2.10

### MOREOVER

The problem occurs sometimes even if the bundles are deployed in the same directory (deploy) and without the dummy files


