package example.watchstoreapp.presentation.common.card

import Black
import GilroyFontFamily
import GrayBorderStroke
import GraySecondTextColor
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.watchstoreapp.ui.theme.DIMENS_16dp
import com.example.watchstoreapp.ui.theme.DIMENS_1dp
import com.example.watchstoreapp.ui.theme.DIMENS_20dp
import com.example.watchstoreapp.ui.theme.DIMENS_6dp
import com.example.watchstoreapp.ui.theme.TEXT_SIZE_16sp
import example.watchstoreapp.domain.model.ProductItem
import com.example.watchStoreApp.R


@Composable
fun FavoriteCard(
    modifier: Modifier = Modifier,
    productItem: ProductItem,
) {
    Column(
        modifier = modifier
            .background(Color.White)
            .padding(DIMENS_16dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = productItem.image),
                contentDescription = stringResource(id = R.string.image_product)
            )

            Spacer(modifier = Modifier.padding(start = DIMENS_16dp))

            Column(
                modifier = Modifier
                    .weight(1F)
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    text = productItem.title,
                    fontFamily = GilroyFontFamily,
                    fontWeight = FontWeight.Bold,
                    color = Black,
                    fontSize = TEXT_SIZE_16sp,
                )

                Spacer(modifier = Modifier.height(DIMENS_6dp))

                Text(
                    text = productItem.unit,
                    fontFamily = GilroyFontFamily,
                    fontWeight = FontWeight.Medium,
                    color = GraySecondTextColor,
                )
            }

            Row(
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Text(
                    text = "${productItem.price}",
                    fontFamily = GilroyFontFamily,
                    fontWeight = FontWeight.Bold,
                    color = Black,
                    fontSize = TEXT_SIZE_16sp,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )

                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = stringResource(R.string.arrow_right),
                )
            }
        }

        Spacer(modifier = Modifier.height(DIMENS_20dp))

        Divider(modifier = Modifier.height(DIMENS_1dp), color = GrayBorderStroke)
    }
}

@Preview
@Composable
fun FavoriteCardPreview() {
    FavoriteCard(
        productItem = ProductItem(
            id = 1,
            title = "Organic Bananas",
            description = "",
            image = R.drawable.product10,
            unit = "7pcs, Priceg",
            price = 4.99,
            size = "100gr",
            review = 4.0
        )
    )
}