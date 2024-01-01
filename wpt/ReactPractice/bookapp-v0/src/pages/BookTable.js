import React, { useEffect, useState } from "react";
import BookService from "../service/BookService";
import { Link } from "react-router-dom";

export default function BookTable() {
  const [bookarray, setbookarray] = useState([]);
  const [searcharray, setsearcharray] = useState([]);
  const [searchbook, setsearchbook] = useState("");
  // const [searcharray,setsearcharray] = useState([]);
  const fetchdata = () => {
    let newarr = BookService.getAllBook();
    setbookarray([...newarr]);
    setsearcharray([...newarr]);
  };
  useEffect(() => {
    console.log("in useeffect");
    fetchdata();
    // console.log(searcharray)
  }, []);
  useEffect(() => {
    if (searchbook !== "") {
      let newarr = bookarray.filter((b) => b.name.includes(searchbook));
      setsearcharray(newarr);
    } else {
      if (bookarray.length > 0) setsearcharray([...bookarray]);
    }
  }, [searchbook]);

  return (
    <div>
      <input
        name="searchbook"
        id="searchbook"
        value={searchbook}
        onChange={(e) => setsearchbook(e.target.value)}
        placeholder="search a book"
      ></input>

      <table className="table table-success table-striped">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">First</th>
            <th scope="col">Last</th>
            <th scope="col">Handle</th>
          </tr>
        </thead>
        <tbody>
          {searcharray.map((book) => (
            <tr key={book.id}>
              <th scope="row">{book.id}</th>
              <td>{book.name}</td>
              <td>{book.price}</td>
              <td>{book.author}</td>
            </tr>
          ))}
        </tbody>
      </table>

      <Link to="/form">
        <button type="button" className="btn btn-primary">
          {" "}ADD NEW BOOK{" "}
        </button>
      </Link>
    </div>
  );
}
