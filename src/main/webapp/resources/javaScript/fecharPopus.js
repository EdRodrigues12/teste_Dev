function quitar(args) {
	if (args.validationFailed) {
		PF('quitar').show();
	} else {
		PF('quitar').hide();
	}
}

function editarEstadoDialog(args) {
	if (args.validationFailed) {
		PF('editarEstado').show();
	} else {
		PF('editarEstado').hide();
	}
}

function adicionarAgrupamentoDialog(args) {
	if (args.validationFailed) {
		PF('agrupamento').show();
	} else {
		PF('agrupamento').hide();
	}
}

function adicionarNovoCfopDialog(args) {
	if (args.validationFailed) {
		PF('novoCfop').show();
	} else {
		PF('novoCfop').hide();
	}
}

function adicionarFornecedorDeProdutoDialog(args) {
	if (args.validationFailed) {
		PF('novoFornecedor').show();
	} else {
		PF('novoFornecedor').hide();
	}
}

function alterarItemPreVendaDialog(args) {
	if (args.validationFailed) {
		PF('alterar').show();
	} else {
		PF('alterar').hide();
	}
}

function adicionarAcessorioDialog(args) {
	if (args.validationFailed) {
		PF('acessorio').show();
	} else {
		PF('acessorio').hide();
	}
}

function adicionarAcessorioCadastroDialog(args) {
	if (args.validationFailed) {
		PF('acessorioCadastro').show();
	} else {
		PF('acessorioCadastro').hide();
	}
}

function adicionarEndDialog(args) {
	if (args.validationFailed) {
		PF('endereco').show();
	} else {
		PF('endereco').hide();
	}
}

function adicionarTelDialog(args) {
	if (args.validationFailed) {
		PF('telefone').show();
	} else {
		PF('telefone').hide();
	}
}

function adicionarEmailDialog(args) {
	if (args.validationFailed) {
		PF('email').show();
	} else {
		PF('email').hide();
	}
}

function adicionarBandeiraDialog(args) {
	if (args.validationFailed) {
		PF('bandeira').show();
	} else {
		PF('bandeira').hide();
	}
}


function adicionarVinculoDialog(args) {
	if (args.validationFailed) {
		PF('vinculo').show();
	}else{
		PF('vinculo').hide();
	}
}

function adicionarEmbalagemDialog(args) {
	if (args.validationFailed) {
		PF('embalagem').show();
	}else{
		PF('embalagem').hide();
	}
}

function adicionarEmbalagemEstoqueDialog(args) {
	if (args.validationFailed) {
		PF('embalagemSelecionada').show();
	}else{
		PF('embalagemSelecionada').hide();
	}
}

function adicionarNovoProdutoGrade(args) {
	if (args.validationFailed) {
		PF('novoProdutoGrade').show();
	}else{
		PF('novoProdutoGrade').hide();
	}
}

function adicionarEstoqueAuxSaida(args) {
	if (args.validationFailed) {
		PF('produtoSelecionado').show();
	}else{
		PF('produtoSelecionado').hide();
	}
}

function novaComandaDialog(args) {
	if (args.validationFailed) {
		PF('novaComanda').show();
	} else {
		PF('novaComanda').hide();
	}
}

function novaComandaPreVendaDialog(args) {
	if (args.validationFailed) {
		PF('novaComandaPreVenda').show();
	} else {
		PF('novaComandaPreVenda').hide();
	}
}
