import {Product} from "../Product";
class ProductService{
    constructor(){
        this.prodarr=[new Product(11,'Chair',34,4444),
        new Product(12,'Shelf',70,2222),
        new Product(13,'Table',50,2000)]
    }
    getallproducts(){
        return this.prodarr;
    }
    insertProduct(p){
        this.prodarr.push(new Product(parseInt(p.pid), p.pname, Number(p.qty), parseFloat(p.price)))
    }
}
export default new ProductService();