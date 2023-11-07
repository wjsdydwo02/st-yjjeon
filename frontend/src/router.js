
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderOrderManagementManager from "./components/listers/OrderOrderManagementCards"
import OrderOrderManagementDetail from "./components/listers/OrderOrderManagementDetail"

import DeliveryDeliveryManagementManager from "./components/listers/DeliveryDeliveryManagementCards"
import DeliveryDeliveryManagementDetail from "./components/listers/DeliveryDeliveryManagementDetail"

import InventoryInventoryManagementManager from "./components/listers/InventoryInventoryManagementCards"
import InventoryInventoryManagementDetail from "./components/listers/InventoryInventoryManagementDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders/orderManagements',
                name: 'OrderOrderManagementManager',
                component: OrderOrderManagementManager
            },
            {
                path: '/orders/orderManagements/:id',
                name: 'OrderOrderManagementDetail',
                component: OrderOrderManagementDetail
            },

            {
                path: '/deliveries/deliveryManagements',
                name: 'DeliveryDeliveryManagementManager',
                component: DeliveryDeliveryManagementManager
            },
            {
                path: '/deliveries/deliveryManagements/:id',
                name: 'DeliveryDeliveryManagementDetail',
                component: DeliveryDeliveryManagementDetail
            },

            {
                path: '/inventories/inventoryManagements',
                name: 'InventoryInventoryManagementManager',
                component: InventoryInventoryManagementManager
            },
            {
                path: '/inventories/inventoryManagements/:id',
                name: 'InventoryInventoryManagementDetail',
                component: InventoryInventoryManagementDetail
            },



    ]
})
