package br.com.alura.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.model.Produto
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(nome = "teste",
                descricao = "Teste desc",
                valor = BigDecimal("19.99")
            ),
            Produto(nome = "teste 1",
                descricao = "Teste desc 1",
                valor = BigDecimal("29.99")
            ),
        ))
//        recyclerView.layoutManager = LinearLayoutManager(this)

//        val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Cesta de frutas"
//
//        val desicracao = findViewById<TextView>(R.id.descricao)
//        desicracao.text = "Laranja, manga e maça"
//
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"

    }
}