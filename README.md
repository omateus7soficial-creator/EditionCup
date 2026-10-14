# Edition Cup 🎬

**Editor de vídeo profissional gratuito para Android 15+ (API 35)**

Sem assinatura • Sem marca-d'água • Sem anúncios obrigatórios • Todas as ferramentas liberadas

---

## Status atual (v0.1.0-alpha)

Esta é a **estrutura inicial** do projeto, pronta para continuar o desenvolvimento no Android Studio e no GitHub.

### O que já está implementado

| Módulo | Status | Descrição |
|--------|--------|-----------|
| Estrutura do projeto | ✅ | Kotlin + Jetpack Compose + Media3 |
| Tema visual | ✅ | Tema escuro (roxo / azul / branco) |
| Navegação | ✅ | Home → Editor → Exportar → Configurações |
| Modelos de dados | ✅ | Timeline não-destrutiva (clips, tracks, project) |
| TimelineEngine | ✅ | Adicionar, cortar, dividir, mover, velocidade, volume, opacidade |
| Undo/Redo | ✅ | Histórico básico de ações |
| PreviewPlayer | ✅ | Wrapper do ExoPlayer (Media3) |
| ExportManager | 🟡 | Esqueleto com Media3 Transformer (exporta 1º clipe) |
| ExportForegroundService | 🟡 | Notificação de progresso (placeholder) |
| Telas UI | 🟡 | Layouts básicos funcionais (placeholders de timeline e player) |

### Prioridades seguintes (recomendadas)

**Prioridade 1 – Funcionalidade core**
1. Importação real de mídia (Photo Picker / MediaStore)
2. Player de preview que respeita a timeline (múltiplos clipes)
3. Timeline interativa (arrastar, zoom, snap)
4. Exportação completa da timeline com Media3 Transformer / Composition
5. Persistência de projetos (Room ou arquivos JSON)

**Prioridade 2 – Performance**
- Hardware decoding/encoding
- Cache de thumbnails
- Modos econômico / equilibrado / alta qualidade
- WorkManager + Foreground Service robusto

**Prioridade 3 – Recursos avançados**
- Efeitos, filtros, chroma key
- Texto e legendas
- Edição de áudio (fade, ducking, EQ)
- Velocidade com curvas / keyframes

**Prioridade 4 – IA local**
- Legendas automáticas (modelos on-device)
- Detecção de cenas / silêncios
- Remoção de fundo (quando viável)

---

## Como abrir e compilar

### Requisitos
- Android Studio Ladybug (2024.2.1) ou mais recente
- JDK 17
- Android SDK 35 (Android 15)
- Dispositivo ou emulador com Android 15+

### Passos
1. Clone este repositório:
   ```bash
   git clone https://github.com/SEU_USUARIO/EditionCup.git
   cd EditionCup
   ```
2. Abra a pasta no Android Studio (`File → Open`).
3. Aguarde o Gradle Sync.
4. Conecte um aparelho Android 15+ ou inicie um emulador API 35.
5. Clique em **Run**.

### Gerar APK de debug
```bash
./gradlew assembleDebug
```
O APK estará em `app/build/outputs/apk/debug/`.

---

## Arquitetura

```
com.editioncup
├── ui/
│   ├── theme/          # Cores, tipografia, Material 3
│   ├── navigation/     # NavHost
│   ├── screens/        # Home, Editor, Export, Settings
│   └── components/     # Componentes reutilizáveis (futuro)
├── data/
│   ├── model/          # Project, TimelineClip, Track, MediaItem…
│   └── repository/     # Persistência (futuro)
├── domain/
│   ├── timeline/       # TimelineEngine + UndoRedoManager
│   ├── media/          # Importação e análise de mídia (futuro)
│   └── export/         # ExportManager + ForegroundService
├── core/
│   ├── player/         # PreviewPlayer (ExoPlayer)
│   └── utils/
└── di/                 # Injeção de dependência (futuro)
```

---

## Licenças e restrições importantes

- **Media3** (AndroidX) → Apache 2.0 (livre para uso comercial)
- Não inclua codecs proprietários ou bibliotecas com licenças incompatíveis (GPL forte, por exemplo) se pretender distribuir na Play Store.
- FFmpeg: se for adicionado no futuro, use builds LGPL e declare corretamente.
- Fontes, músicas e modelos de IA devem ter licenças permissivas (SIL, Apache, MIT, CC0 etc.).
- Nunca envie vídeos do usuário para a nuvem sem consentimento explícito.

---

## Contribuição

1. Crie uma branch a partir de `main`.
2. Implemente uma funcionalidade completa e testável.
3. Documente limitações conhecidas.
4. Abra um Pull Request.

---

## Aviso de realismo

Um editor de vídeo profissional completo (nível CapCut) leva **muitos meses** de desenvolvimento.  
Esta base foi criada para você continuar de forma organizada no GitHub.  
Cada módulo deve ser implementado, testado em dispositivos reais e documentado antes de ser considerado “pronto”.

**Todos os recursos implementados devem permanecer gratuitos e sem marca-d'água.**

---

Feito com ☕ + Kotlin + Media3  
Edition Cup © 2026
