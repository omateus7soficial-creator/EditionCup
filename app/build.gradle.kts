name: Build APK

on:
  push:
    branches: [ main, principal ]
  workflow_dispatch:

jobs:
  build:
    name: Build Debug APK
    runs-on: ubuntu-latest

    steps:
      - name: Checkout código
        uses: actions/checkout@v4

      - name: Configurar JDK 17
        uses: actions/setup-java@v4
        with:
          java-version: '17'
          distribution: 'temurin'

      - name: Configurar Android SDK
        uses: android-actions/setup-android@v3

      - name: Gerar Gradle Wrapper
        run: |
          gradle wrapper --gradle-version 8.9 || true
          chmod +x ./gradlew || true

      - name: Compilar APK Debug
        run: ./gradlew assembleDebug --stacktrace

      - name: Upload do APK
        uses: actions/upload-artifact@v4
        with:
          name: EditionCup-debug
          path: app/build/outputs/apk/debug/*.apk
          retention-days: 14
