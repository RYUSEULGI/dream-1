import axios from "axios";
import React, { useState } from "react";

const ItemCreate = () => {
    const [itemNo, setItemNo] = useState("");
    const [itemBrand, setItemBrand] = useState("");
    const [itemName, setItemName] = useState("");
    const [modelNo, setModelNo] = useState("");
    const [itemColor, setItemColor] = useState("");
    const [releaseDate, setReleaseDate] = useState("");
    const [soldOut, setSoldOut] = useState(true);

    const handleSubmit = (e) => {
        axios
            .post("http://localhost:8080/items", {
                itemNo,
                itemBrand,
                itemName,
                modelNo,
                itemColor,
                releaseDate,
                soldOut,
            })
            .then((res) => {
                console.log(res);
                setItemBrand(e.target.value);
                setItemNo(e.target.value);
                setItemName(e.target.value);
                setModelNo(e.target.value);
                setItemColor(e.target.value);
                setReleaseDate(e.target.value);
                setSoldOut(e.target.value);
            })
            .catch((err) => console.log(err));
    };

    return (
        <>
            <h1>Create</h1>
            <form onSubmit={handleSubmit} method="post">
                브랜드 : <input type="text" value={itemBrand} />
                <br />
                모델번호 : <input type="text" value={modelNo} />
                <br />
                제품이름 : <input type="text" value={itemName} />
                <br />
                색상 : <input type="text" value={itemColor} />
                <br />
                출시날짜 : <input type="text" value={releaseDate} />
                <br />
                판매상태 : <input type="radio" value={soldOut} />
                <button type="submit">등록하기</button>
            </form>
        </>
    );
};

export default ItemCreate;
