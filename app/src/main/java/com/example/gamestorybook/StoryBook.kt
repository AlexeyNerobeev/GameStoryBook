package com.example.gamestorybook

import androidx.compose.runtime.Composable
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.example.gameuikit.Presentation.BottomBar
import com.example.gameuikit.Presentation.CustomCard
import com.example.gameuikit.Presentation.CustomCheckbox
import com.example.gameuikit.Presentation.CustomDatePicker
import com.example.gameuikit.Presentation.InputTF
import com.example.gameuikit.Presentation.LogoutButton
import com.example.gameuikit.Presentation.MainButton
import com.example.gameuikit.Presentation.ProgressCircles
import com.example.gameuikit.Presentation.Timer
import com.example.gameuikit.R


//31.03.2026
//Алексей
//методы для отображения всех элементов uikit
@ShowkaseComposable
@Composable
fun showMainButton(){
    MainButton(
        onCLick = {},
        text = "text"
    )
}

@ShowkaseComposable
@Composable
fun showLogout(){
    LogoutButton() { }
}

@ShowkaseComposable
@Composable
fun showInput(){
    InputTF(
        value = "",
        onValueChange = {},
        withTrailingIcon = false,
        placeholder = "placeholder"
    )
}

@ShowkaseComposable
@Composable
fun showTimer(){
    Timer(
        minutes = 0,
        seconds = 0
    )
}

@ShowkaseComposable
@Composable
fun showPagination(){
    ProgressCircles(
        currentCircle = 1
    )
}

@ShowkaseComposable
@Composable
fun showCheckBoxChecked(){
    CustomCheckbox(
        checked = true
    ) { }
}

@ShowkaseComposable
@Composable
fun showCheckBoxUnchecked(){
    CustomCheckbox(
        checked = false
    ) { }
}

@ShowkaseComposable
@Composable
fun showCard(){
    CustomCard(
        title = "title",
        text = "text",
        onCLick = {},
        image = R.drawable.schedule_image
    )
}

@ShowkaseComposable
@Composable
fun showBottomBar(){
    BottomBar(
        onStatisticsClick = {},
        onDiscoverClick = {},
        onChatClick = {},
        onProfileClick = {},
        onScheduleClick = {},
        currentScreen = 1
    )
}

@ShowkaseComposable
@Composable
fun showDatePicker(){
    CustomDatePicker(
        title = "title",
        value = "value"
    ) { }
}