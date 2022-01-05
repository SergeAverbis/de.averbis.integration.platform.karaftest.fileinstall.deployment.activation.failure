# karaftest

> mvn clean install -DKARAF_VERSION=4.2.14
>
> docker exec -it karaftest_karaftest_1 client
>
> list | grep Averbis
>

12 │ Resolved │ 80 │ 0.9.0.SNAPSHOT │ Averbis Platform :: Karaf Test :: bundleimpl<br>
13 │ Resolved │ 80 │ 0.9.0.SNAPSHOT │ Averbis Platform :: Karaf Test :: bundleclient<br>
14 │ Active │ 80 │ 0.9.0.SNAPSHOT │ Averbis Platform :: Karaf Test :: bundleapi
(not all bundles are started)<br>
[karaf.log](./karaf.log)

> start 12
>
> start 13
>
ACTIVATING BundleClient BundleApi says 'My Name is BundleImpl James
de.averbis.integration.karaftest.bundleimpl.BundleImpl'
> list | grep Averbis
>
12 │ Active │ 80 │ 0.9.0.SNAPSHOT │ Averbis Platform :: Karaf Test :: bundleimpl<br>
13 │ Active │ 80 │ 0.9.0.SNAPSHOT │ Averbis Platform :: Karaf Test :: bundleclient<br>
14 │ Active │ 80 │ 0.9.0.SNAPSHOT │ Averbis Platform :: Karaf Test :: bundleapi
(all bundles are started. We expected that at the beginning)<br>

With Karaf 4.2.13 all the Averbis bundles are started at the first time
> mvn clean install -DKARAF_VERSION=4.2.13