By default the project is using **Kotlin 2.1.0** with language version **1_9**. See [build.gradle.kts](build.gradle.kts)
To reproduce the issue:

```shell
./gradlew :composeApp:compileKotlinWasmJs
```

or 

```shell
./gradlew :composeApp:compileKotlinIosArm64
```


But it works with Kotlin 2.0.21 with language version 1_9.

You can change Kotlin version in [libs.versions.toml](./gradle/libs.versions.toml)