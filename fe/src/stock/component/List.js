import axios from 'axios'
import React, { useState, useEffect }from 'react'

const List = () => {

    const [list, setList] = useState([]);

    const fetchList = () => {
        axios.get("http://localhost:8080/items/list")
            .then( res => {
                console.log(res);
                setList(res.data);
            })
            .catch( err => console.log(err));
    }

    useEffect(() => {
        console.log('화면이 렌더 될 때 마다 호출 mount');
        fetchList();
    }, []);

    return list.map((item) => {
        return (
            <ul>
                <li className="item-no" key={item.id}>{item.itemNo}</li>
                <li className="item-brand">{item.itemBrand}</li>
                <li className="model-no">{item.modelNo}</li>
                <li className="item-name">{item.itemName}</li>
                <li className="item-color">{item.itemColor}</li>
                <li className="release-date">{item.releaseDate}</li>
                <li className="sold-out">{item.soldOut}</li>
            </ul>
        )
    })
}

export default List
