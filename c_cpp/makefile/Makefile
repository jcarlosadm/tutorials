############ início da configuração ############################

# terminação dos arquivos fontes
SRC_SUFFIX= c

# diretório dos objetos
OBJ_DIR= objects/
# diretório do binário principal
BIN_DIR= bin/
# diretório dos binários de testes
BIN_TESTS_DIR= bin/tests/
# diretório dos arquivos fontes de testes
SRC_TESTS_DIR= srcTests/
# diretório dos arquivos fontes
SRC_DIR= src/

# as flags e opções usadas
# compilador
CC= gcc
# flags usadas pelo compilador
CCFLAGS= -Wall
# bibliotecas usadas no projeto
LIBDEPS=

# gerar link simbólico do binário para a pasta raiz? YES ou NO
BUILDLINK_TO_ROOT=YES

############ fim da configuração ###############################

# nome do binário principal
BIN_NAME= main

# obtém uma lista de todos os arquivos fontes
SRC_LIST= $(wildcard $(SRC_DIR)*.$(SRC_SUFFIX))
# obtém uma lista de todos os arquivos objetos a serem criados
OBJ_LIST:= $(patsubst $(SRC_DIR)%.$(SRC_SUFFIX),$(OBJ_DIR)%.o, $(SRC_LIST))

# comando para criar diretórios
MK_DIR= mkdir -p

.PHONY: makedir_objects
.PHONY: makedir_bin
.PHONY: makedir_bin_tests

# verifica se é necessário criar link simbólico para o binário
ifeq ($(BUILDLINK_TO_ROOT),YES)
    all: makedir_objects makedir_bin makedir_bin_tests $(BIN_DIR)$(BIN_NAME) makeLinkToBin
endif

# comando principal
all: makedir_objects makedir_bin makedir_bin_tests $(BIN_DIR)$(BIN_NAME)

# cria diretório dos objetos
makedir_objects:
	$(MK_DIR) $(OBJ_DIR)

# cria diretório dos binários
makedir_bin:
	$(MK_DIR) $(BIN_DIR)

# cria diretório para binário de testes
makedir_bin_tests:
	$(MK_DIR) $(BIN_TESTS_DIR)

# gera link simbólico para binário
makeLinkToBin:
	ln -nsf $(BIN_DIR)$(BIN_NAME) $(BIN_NAME)

# criação do binário principal
$(BIN_DIR)$(BIN_NAME): $(OBJ_LIST)
	$(CC) -o $@ $^ $(LIBDEPS)

# pull in dependency info for *existing* .o files
-include $(OBJ_LIST:.o=.d)

# comando da construção de cada arquivo de objeto
$(OBJ_DIR)%.o: $(SRC_DIR)%.$(SRC_SUFFIX)
	$(CC) -c $(CCFLAGS) $< -o $@
	$(CC) -MM -c $(CCFLAGS) $(SRC_DIR)$*.$(SRC_SUFFIX) > $(OBJ_DIR)$*.d
	@mv -f $(OBJ_DIR)$*.d $(OBJ_DIR)$*.d.tmp
	@sed -e 's|.*:|$(OBJ_DIR)$*.o:|' < $(OBJ_DIR)$*.d.tmp > $(OBJ_DIR)$*.d
	@sed -e 's/.*://' -e 's/\\$$//' < $(OBJ_DIR)$*.d.tmp | fmt -1 | \
	  sed -e 's/^ *//' -e 's/$$/:/' >> $(OBJ_DIR)$*.d
	@rm -f $(OBJ_DIR)$*.d.tmp

.PHONY: clean
# comando para limpar tudo
clean:
	rm -rf $(OBJ_DIR)*.o $(OBJ_DIR)*.d $(BIN_TESTS_DIR)* $(BIN_DIR)$(BIN_NAME) $(BIN_NAME)

# exemplo de teste:
#
#(basta evocar 'make testStruct')
#
#testStruct: binNameTest
#
#binNameTest: $(OBJ_DIR)/binNameTest.o $(OBJ_LIST)
#	$(CC) -o $(BIN_DIR)/$(BIN_TESTS_DIR)/$@ $^ $(LIBDEPS)
#
#$(OBJ_DIR)/binNameTest.o: $(SRC_TESTS_DIR)/binNameTest.cpp binSrcDeps
#	$(CC) $(CPPFLAGS) $< -o $@
#
