import androidx.compose.foundation.background
import androidx.compose.material.Scaffold
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.CanvasBasedWindow
import components.AboutCard
import components.ProgrammerProfile


import kotlin.wasm.unsafe.*

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow("sample", canvasElementId = "sample") {
        Scaffold(Modifier.background(Color.Yellow)){
            AboutCard()
        }
    }
}