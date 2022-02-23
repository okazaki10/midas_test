package com.example.myapplication.model

import com.google.gson.annotations.SerializedName

data class Delivery(

	@field:SerializedName("payload")
	val payload: List<PayloadItem?>? = null,

	@field:SerializedName("success")
	val success: Boolean? = null,

	@field:SerializedName("errors")
	val errors: List<Any?>? = null
)

data class MenusItem(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("price")
	val price: Int? = null,

	@field:SerializedName("discPrice")
	val discPrice: Int? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("ind")
	val ind: String? = null,

	@field:SerializedName("eng")
	val eng: String? = null
)

data class PayloadItem(

	@field:SerializedName("shop")
	val shop: List<ShopItem?>? = null
)

data class ShopItem(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("Menus")
	val menus: List<MenusItem?>? = null,

	@field:SerializedName("shopName")
	val shopName: String? = null
)
