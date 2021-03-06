package me.harry.jpa.shop.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class Member(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "member_id")
        val id: Long? = null,

        val name: String,

        val city: String,

        val street: String,
        
        val zipcode: String,

        @OneToMany(mappedBy = "member")
        val orders: MutableList<Order> = mutableListOf()
)