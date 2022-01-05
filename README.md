# karaftest

> mvn clean install -DKARAF_VERSION=4.2.14
>
> docker exec -it karaftest_karaftest_1 client
>
> list | grep Averbis
>

xx │ Resolved │ 80 │ 0.9.0.SNAPSHOT │ Averbis Platform :: Karaf Test :: bundleimpl<br>
yy │ Active │ 80 │ 0.9.0.SNAPSHOT │ Averbis Platform :: Karaf Test :: bundleapi<br>
(not all bundles are started)<br>
[karaf.log](./karaf.log)

> start yy
>
> list | grep Averbis
>
xx │ Active │ 80 │ 0.9.0.SNAPSHOT │ Averbis Platform :: Karaf Test :: bundleimpl<br>
xx │ Active │ 80 │ 0.9.0.SNAPSHOT │ Averbis Platform :: Karaf Test :: bundleapi
(all bundles are started. We expected that at the beginning)<br>