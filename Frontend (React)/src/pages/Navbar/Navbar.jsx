import React from "react";
import "./Navbar.css";
import { Avatar } from "@mui/material";
import { useDispatch, useSelector } from "react-redux";

const Navbar = () => {
  const dispatch = useDispatch();
  const { auth } = useSelector((store) => store);
  return (
    <div className="container sticky py-3 lg:px-10 flex justify-between items-center">
      <p className="font-bold text-lg">Sync Hub</p>
      <div className="flex items-center gap-5">
        <p className="font-semibold text-lgx">{auth.user.fullName}</p>
        <Avatar alt="" src="" />
      </div>
    </div>

  );
};

export default Navbar;
