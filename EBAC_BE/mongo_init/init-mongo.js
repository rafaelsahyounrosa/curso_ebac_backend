db = db.getSiblingDB('cliente');
db.createUser({
    user: 'admin',
    pwd: 'admin',
    roles: [{ role: 'readWrite', db: 'cliente' }]
});

db = db.getSiblingDB('produto');
db.createUser({
    user: 'admin',
    pwd: 'admin',
    roles: [{ role: 'readWrite', db: 'produto' }]
});

db = db.getSiblingDB('venda');
db.createUser({
    user: 'admin',
    pwd: 'admin',
    roles: [{ role: 'readWrite', db: 'venda' }]
});
