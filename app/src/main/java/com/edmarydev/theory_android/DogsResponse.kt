package com.edmarydev.theory_android

import com.google.gson.annotations.SerializedName

/**
 * EL serializable nos permite llamar a nuestras variables con nombres diferentes a los que se manejan en el API de esa manera
 * podemos crear codigo mas entendible
 * @SerializedName("nombre_en_el_API") var elNombreQueQuiero:type
 * */
data class DogsResponse (
    @SerializedName("status")var status:String,
    @SerializedName("message")var images:List<String>)