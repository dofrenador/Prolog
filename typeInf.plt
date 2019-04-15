:- begin_tests(typeInf).
:- include(typeInf). 

/* Note: when writing tests keep in mind that 
    the use of of global variable and function definitions
    define facts for gvar() predicate. Either test
    directy infer() predicate or call
    delegeGVars() predicate to clean up gvar().
*/

% tests for typeExp
test(typeExp_iplus) :- typeExp(iplus(int,int), int).

test(typeExp_fplus) :- typeExp(fplus(float,float), float).
test(typeExp_isub) :- typeExp(isub(int,int), int).
test(typeExp_fsub) :- typeExp(fsub(float,float), float).
test(typeExp_iMult) :- typeExp(iMult(int,int), int).
test(typeExp_fMult) :- typeExp(fMult(float,float), float).



% this test should fail
test(typeExp_iplus_F, [fail]) :- typeExp(iplus(int, int), float).
test(typeExp_iplus_T, [true(T == int)]) :- typeExp(iplus(int, int), T).

test(iplus_f, [fail]) :- typeExp(iplus(int,int), float).
test(fMult_f, [fail]) :- typeExp(fMult(int, float), float).

% NOTE: use nondet as option to test if the test is nondeterministic

% test for statement with state cleaning
test(typeStatement_gvar, [nondet, true(T == int)]) :- % should succeed with T=int
    deleteGVars(), /* clean up variables */
    typeStatement(gvLet(v, T, iplus(X, Y)), unit),
    assertion(X == int), assertion( Y == int), % make sure the types are int
    gvar(v, int). % make sure the global variable is defined

% same test as above but with infer 
test(infer_gvar, [nondet]) :-
    infer([gvLet(v, T, iplus(X, Y))], unit),
    assertion(T==int), assertion(X==int), assertion(Y=int),
    gvar(v,int).

% test custom function with mocked definition
test(mockedFct, [nondet]) :-
    deleteGVars(), % clean up variables since we cannot use infer
    asserta(gvar(my_fct, [int, float])), % add my_fct(int)-> float to the gloval variables
    typeExp(my_fct(X), T), % infer type of expression using or function
    assertion(X==int), assertion(T==float). % make sure the types infered are correct

:-end_tests(typeInf).
