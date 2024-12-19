By default the project is using **Kotlin 2.1.0** with language version **1_9**. See [build.gradle.kts](build.gradle.kts)
To reproduce the issue:

```shell
./gradlew :composeApp:compileKotlinWasmJs
```

or 

```shell
./gradlew :composeApp:compileKotlinIosArm64
```


The compilation error:

```
Compilation failed: SIG: FUN name:takeComposable visibility:public modality:FINAL <> (content:kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>) returnType:kotlin.Unit
 Ir: takeComposable(kotlin.Function2<androidx.compose.runtime.Composer,kotlin.Int,kotlin.Unit>){}
 Descriptor: takeComposable(kotlin.Function0<kotlin.Unit>){}
```

But it works with Kotlin 2.0.21 with language version 1_9.

You can change Kotlin version in [libs.versions.toml](./gradle/libs.versions.toml)