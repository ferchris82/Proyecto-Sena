import { Injectable } from '@angular/core';
import { ItemCart } from '../common/item-cart';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  private items: Map<number, ItemCart> = new Map<number, ItemCart>();

  itemList : ItemCart[] = [];

  constructor() { }

  addItemCart(itemCart: ItemCart){}

  deleteItemCart(productId:number){}

  totalCart(){}

  convertToListFromMap(){}
}
