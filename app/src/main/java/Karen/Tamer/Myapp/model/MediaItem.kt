package Karen.Tamer.Myapp.model

import Karen.Tamer.Myapp.model.MediaItem.*

data class MediaItem(
    val id: Int,
    val title: String,
    val thumb: String,
    val type: Type
){
    enum class Type {PHOTO, VIDEO}
}

fun getMedia() = (1..20).map{
    MediaItem(
        id = it,
        title = "Imagen $it",
        thumb = "https://picsum.photos/200=$it",
        type = if(it % 3 == 0) Type.VIDEO else Type.PHOTO
    )
}