package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buisnesscard.R
import com.example.buisnesscard.ui.theme.BuisnessCardTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BuisnessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }
}

@Composable
fun LogoNameTitle(
    modifier: Modifier
) {
    Column(modifier = modifier) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android Logo",
            //contentScale = ContentScale.Fit,
            modifier = Modifier
                .background(color = Color.Black)
                .scale(0.75f)
                .padding(8.dp)
        )
        Text(stringResource(R.string.my_name),
            fontSize = 50.sp,
            textAlign = TextAlign.Center)
        Text(stringResource(R.string.my_title),
            fontSize = 30.sp,
            textAlign = TextAlign.Center)
    }
}

@Composable
fun ContactInfo(
    modifier: Modifier = Modifier
) {
    Column() {

        Row (){
            Icon(
                painter = painterResource(R.drawable.baseline_contact_phone_24),
                tint = Color.Green,
                contentDescription = "phone contact image"

            )
            Text(
                text = stringResource(R.string.phoneNumber)
            )
        }

        Row (){
            Icon(
                imageVector = Icons.TwoTone.Share,
                tint = Color.Blue,
                contentDescription = "phone"
            )
            Text(
                text = stringResource(R.string.handle)
            )
        }
        Row(){
            Text(
                text = stringResource(R.string.email)
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BusinessCardApp(
    modifier: Modifier = Modifier
){
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center,

        ) {
        LogoNameTitle(modifier = Modifier)

        ContactInfo()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BuisnessCardTheme {
        LogoNameTitle(modifier = Modifier)
    }
}
@Preview(showBackground = true)
@Composable
fun ContactInfoPreview() {
    ContactInfo()
}
