package example.watchstoreapp.presentation.screen.explore

import Black
import GilroyFontFamily
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.watchStoreApp.R
import com.example.watchstoreapp.ui.theme.DIMENS_10dp
import com.example.watchstoreapp.ui.theme.DIMENS_12dp
import com.example.watchstoreapp.ui.theme.DIMENS_16dp
import com.example.watchstoreapp.ui.theme.TEXT_SIZE_18sp
import example.watchstoreapp.presentation.common.card.CategoryCard
import example.watchstoreapp.presentation.component.SearchViewBar
import example.watchstoreapp.utils.DataDummy

@Composable
fun ExploreScreen(
    modifier: Modifier = Modifier
) {
    Scaffold { paddingValues ->
        Column(
            modifier = modifier.padding(paddingValues)
        ) {
            Text(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = DIMENS_16dp),
                text = stringResource(R.string.find_products),
                fontFamily = GilroyFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = TEXT_SIZE_18sp,
                color = Black
            )

            SearchViewBar(hint = stringResource(id = R.string.search_category))

            LazyVerticalGrid(
                modifier = Modifier.padding(start = DIMENS_16dp, end = DIMENS_16dp),
                columns = GridCells.Fixed(2),
                verticalArrangement = Arrangement.spacedBy(DIMENS_10dp),
                horizontalArrangement = Arrangement.spacedBy(DIMENS_12dp),
            ) {
                items(DataDummy.generateDummyCategories()) { categoryItem ->
                    CategoryCard(categoryItem = categoryItem)
                }
            }
        }
    }
}

@Preview
@Composable
fun ExploreScreenPreview() {
    ExploreScreen()
}