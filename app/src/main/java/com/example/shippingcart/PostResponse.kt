package com.example.shippingcart

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PostResponse(
    @SerializedName("id")
    @Expose
    val id: Int,

    @SerializedName("kkeranjang_k")
    @Expose
    val keranjang: String?,

    @SerializedName("kbarang_k")
    @Expose
    val barang: String?,

    @SerializedName("qty_k")
    @Expose
    val qty: Int,

    @SerializedName("harga_k")
    @Expose
    val harga: String?,

    @SerializedName("is_status")
    @Expose
    val status: Int,


)