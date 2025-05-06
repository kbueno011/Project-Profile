
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R

@Composable
fun TelaProfile(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(340.dp),
                shape = RoundedCornerShape(0.dp, 0.dp, 20.dp, 20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = br.senai.sp.jandira.R.drawable.img),
                        contentDescription = "Imagem de fundo",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Voltar",
                        tint = Color.White,
                        modifier = Modifier
                            .padding(
                                start = 20.dp,
                                end = 20.dp,
                                top = 50.dp
                            )
                            .align(Alignment.TopStart)
                    )
                    Box(
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 50.dp)
                    ) {
                        Text(
                            text = stringResource(br.senai.sp.jandira.R.string.details),
                            color = Color.White,
                            fontSize = 20.sp
                        )
                    }
                    Card(
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 100.dp)
                            .size(80.dp),
                        shape = CircleShape,
                    ) {
                        Image(
                            painter = painterResource(br.senai.sp.jandira.R.drawable.profile),
                            contentDescription = ""
                        )
                    }
                    Text(
                        text = stringResource(R.string.jenny),
                        color = Color.White,
                        fontSize = 18.sp,
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 200.dp)
                    )
                    Text(
                        text = stringResource(R.string.sr),
                        color = Color(0xA8F4F4F5),
                        fontSize = 14.sp,
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 230.dp)
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 15.dp, vertical = 5.dp)
                            .align(Alignment.BottomCenter),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        // Primeiro card
                        Card(
                            modifier = Modifier
                                .size(80.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0x00F4F4F5)
                            ),
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(1.dp, Color(0xA8F4F4F5))
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    modifier = Modifier.size(24.dp),
                                    imageVector = Icons.Default.Email,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = stringResource(R.string.email),
                                    color = Color.White,
                                    fontSize = 12.sp
                                )
                            }
                        }
                        // Segundo card
                        Card(
                            modifier = Modifier
                                .size(80.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0x00F4F4F5)
                            ),
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(1.dp, Color(0xA8F4F4F5))
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    modifier = Modifier.size(24.dp),
                                    imageVector = Icons.Default.Call,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = stringResource(R.string.call),
                                    color = Color.White,
                                    fontSize = 12.sp
                                )
                            }
                        }
                        // Terceiro card
                        Card(
                            modifier = Modifier
                                .size(80.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0x00F4F4F5)
                            ),
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(1.dp, Color(0xA8F4F4F5))
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    modifier = Modifier.size(24.dp),
                                    imageVector = Icons.Default.MailOutline,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = stringResource(R.string.wpp),
                                    color = Color.White,
                                    fontSize = 12.sp
                                )
                            }
                        }
                        // Quarto card
                        Card(
                            modifier = Modifier
                                .size(80.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0x00F4F4F5)
                            ),
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(1.dp, Color(0xA8F4F4F5))
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(7.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    modifier = Modifier.size(25.dp),
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    text = stringResource(R.string.favorite),
                                    color = Color.White,
                                    fontSize = 12.sp
                                )
                            }
                        }
                    }
                }
            }
            Column (
                modifier = Modifier
                    .padding(horizontal = 19.dp)
                    .padding(14.dp)
                    .fillMaxSize()
            ){
                Row(

                    horizontalArrangement = Arrangement.Absolute.Left
                ) {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Email",
                        tint = Color(0xFFA747C0),
                        modifier = Modifier
                            .size(25.dp)
                    )
                    Text(
                        text = stringResource(R.string.email),
                        fontSize = 15.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .padding(4.dp)
                    )
                }
                Text(
                    modifier = Modifier.padding(start = 35.dp, top = 5.dp),
                    text = stringResource(R.string.official),
                    color = Color.Gray,
                    fontSize = 12.sp
                )
                Text(
                    modifier = Modifier.padding(start = 35.dp, top = 5.dp),
                    text = stringResource(R.string.email_mich),
                    color = Color.Black,
                    fontSize = 14.sp
                )
                Text(
                    modifier = Modifier.padding(start = 35.dp, top = 5.dp),
                    text = stringResource(R.string.personal),
                    color = Color.Gray,
                    fontSize = 12.sp
                )
                Text(
                    modifier = Modifier.padding(start = 35.dp, top = 5.dp),
                    text = stringResource(R.string.email_mich2),
                    color = Color.Black,
                    fontSize = 14.sp
                )

                HorizontalDivider(modifier = Modifier
                    .width(370.dp)
                    .padding(top = 20.dp, end = 20.dp)
                )

                Row(
                    modifier = Modifier.padding(top = 20.dp),
                    horizontalArrangement = Arrangement.Absolute.Left
                ) {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = "telefone",
                        tint = Color(0xFFA747C0),
                        modifier = Modifier
                            .size(25.dp)
                    )
                    Text(
                        text = stringResource(R.string.phone_number),
                        fontSize = 15.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .padding(4.dp)
                    )
                }
                Text(
                    modifier = Modifier.padding(start = 35.dp, top = 5.dp),
                    text = stringResource(R.string.mobile),
                    color = Color.Gray,
                    fontSize = 12.sp
                )
                Text(
                    modifier = Modifier.padding(start = 35.dp, top = 5.dp),
                    text = stringResource(R.string.number),
                    color = Color.Black,
                    fontSize = 14.sp
                )

                HorizontalDivider(modifier = Modifier
                    .width(370.dp)
                    .padding(top = 20.dp, end = 20.dp)
                )


            }

            Column (
                modifier = Modifier

            ){

            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TelaProfilePreview() {
    TelaProfile()
}