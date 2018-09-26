package com.github.thaynarasilvapinto.SimuladorBanco.domain;

import java.util.ArrayList;

public class Banco {
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public  Banco(){
    }
    public Banco(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public Cliente add(Cliente cliente){
        if(verificaCPF(cliente)){
            cliente.setId(clientes.size());
            cliente.getConta().setId(clientes.size());
            clientes.add(cliente);
            return cliente;
        }
        return null;
    }
    public Cliente find(Integer id){
        return clientes.get(id);
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public Conta findConta(Integer id){
        return clientes.get(id).getConta();
    }
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public boolean verificaCPF(Cliente cliente){
        for(int i=0;i<clientes.size();i++){
            if(clientes.get(i).getCpf().equals(cliente.getCpf())){
                return false;
            }
        }
        return true;
    }
}
