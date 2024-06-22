//설정 파일에는 필요한 라이브러리나 플러그인을 찾을 수 있는 저장소를 정의합니다.
//이는 메인 빌드의 pluginManagementBlock과 유사한 항목을 포함합니다.
dependencyResolutionManagement {
    repositories.gradlePluginPortal()
}

include("java-plugins")