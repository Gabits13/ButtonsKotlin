package com.example.appnavigation

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ContentView
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appnavigation.components.BotonIcono
import com.example.appnavigation.components.Space
import com.example.appnavigation.components.BotonNormal
import com.example.appnavigation.components.BotonNormal2
import com.example.appnavigation.components.BotonOutline
import com.example.appnavigation.components.BotonSwitch
import com.example.appnavigation.components.BotonTexto
import com.example.appnavigation.components.DarkMode
import com.example.appnavigation.components.FloatingAction

import com.example.appnavigation.ui.theme.AppNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val darkMode = remember{ mutableStateOf(false) }
            AppNavigationTheme(darkTheme = darkMode.value) {
                //a scaffold container usando o background color do tema
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

                    Content (darkMode = darkMode)

                }
            }
        }
    }
}

@Composable
fun Content(darkMode: MutableState<Boolean>){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        BotonNormal()
        Space()
        BotonNormal2()
        Space()
        BotonTexto()
        Space()
        BotonOutline()
        Space()
        BotonIcono()
        Space()
        BotonSwitch()
        Space()
        DarkMode (darkMode = darkMode)
        Space()
        FloatingAction()
    }

}


