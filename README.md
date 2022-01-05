# REPRODUCING BUNDLE DEPLOYMENT FAILURE (fileinstall)

> docker rm -f karaftest_karaftest_1
>
> mvn clean install -DKARAF_VERSION=4.2.14
>
> docker exec -it karaftest_karaftest_1 client list | grep bundle
>
xx │ Resolved │ 80 │ 0.9.0.SNAPSHOT │ bundleimpl<br>
yy │ Active │ 80 │ 0.9.0.SNAPSHOT │ bundleapi<br>
(the bundle 'bundleimpl' is not Active)<br>
[karaf.log](./karaf.log)

> docker exec -it karaftest_karaftest_1 client start xx
>
OR
> docker restart karaftest_karaftest_1
>
THEN
> docker exec -it karaftest_karaftest_1 client list | grep bundle
>
xx │ Active │ 80 │ 0.9.0.SNAPSHOT │ bundleimpl<br>
xx │ Active │ 80 │ 0.9.0.SNAPSHOT │ bundleapi
(the bundle 'bundleimpl' is now Active)<br>
<br>

### KEY POINTS

The bundle 'bundleimpl'

- imports a package of '* :: bundleapi'
- is deployed in a separate directory 'deploy2'

The bundle 'bundleapi' contains dummy files (ballast*) to make it big

### REPRODUCED IN

Karaf 4.2.14 4.2.13 4.2.12 4.2.11 4.2.10

### MOREOVER

The problem occurs sometimes even if the bundles are deployed in the same directory (deploy) and without the dummy files


