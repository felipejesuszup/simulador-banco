package com.github.thaynarasilvapinto.simuladorbanco.services

import com.github.thaynarasilvapinto.simuladorbanco.domain.Cliente
import com.github.thaynarasilvapinto.simuladorbanco.repositories.ClienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*


@Service
open class ClienteService {

    @Autowired
    private lateinit var repo: ClienteRepository

    fun find(id: Int): Optional<Cliente> {
        return repo.findById(id)
    }

    fun insert(obj: Cliente) = repo.save(obj)

    fun update(cliente: Cliente): Cliente {
        find(cliente.id)
        return repo.save(cliente)
    }

    fun delete(id: Int) {
        find(id)
        repo.deleteById(id)
    }

    fun findCPF(CPF: String): Optional<Cliente> {
        return repo.findByCpfEquals(CPF)
    }

}