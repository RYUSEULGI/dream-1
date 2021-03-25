import {Route} from 'react-router-dom'
import ItemLilst from './stock/container/ItemLilst';
import ItemCreate from './stock/container/ItemCreate';

const App = () => (
  <>
    <Route path ="/items/list" component={ItemLilst} />
    <Route path ="/items/create" component={ItemCreate} />
  </>
)

export default App;
