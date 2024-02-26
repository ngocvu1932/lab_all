import express from 'express';
import data from './store.js';
import multer from 'multer';

const PORT = 3000;
const app = express();
const upload = multer();

app.use(express.json({extended: false}));
app.use(express.static('./views'));

app.set('view engine', 'ejs');
app.set('views', './views');

app.get('/', (req, res)=>{
    const courses = data;

    return res.render('index', {courses});
})

app.post('/', upload.fields([]), (req, res)=> {
    data.push(req.body);
    // console.log(data);
    return res.redirect('/');
})

app.post('/delete', upload.fields([]), (req, res)=> {
    const id = req.body.sel;
    // data.splice(id, 1);
    // return res.redirect('/');
    console.log(id);
})

app.listen(PORT, ()=>{
    console.log(`Server is running on port ${PORT}`);
})