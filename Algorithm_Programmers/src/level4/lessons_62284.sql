select
    distinct a.cart_id
    from(select 
            cart_id
            ,name
            from CART_PRODUCTS 
            where name = 'Yogurt'
        ) a inner join  
    (select 
        cart_id 
        ,name 
        from cart_products
        where name = 'Milk'
) b on a.cart_id = b.cart_id
order by a.cart_id 
