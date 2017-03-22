package com.attiqrao.systemsltd.list_to_do;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class ToDoItem implements Serializable {
    private static final String TODOTEXT = "todotext";
    private static final String TODODESC = "tododesc";
    private static final String TODOREMINDER = "todoreminder";
    //    private static final String TODOLASTEDITED = "todolastedited";
    private static final String TODOCOLOR = "todocolor";
    private static final String TODODATE = "tododate";
    private static final String FROMDODATE = "fromdodate";
    private static final String TODOIDENTIFIER = "todoidentifier";
    private String mToDoText, mTodoDesc;
    private boolean mHasReminder;
    //    private Date mLastEdited;
    private int mTodoColor;
    private Date mToDoDate;
    private Date mFromDoDate;
    private UUID mTodoIdentifier;


    public ToDoItem(String todoBody, String todoDesc, boolean hasReminder, Date toDoDate, Date fromDoDate) {
        mToDoText = todoBody;
        mHasReminder = hasReminder;
        mToDoDate = toDoDate;
        mTodoDesc = todoDesc;
        mFromDoDate = fromDoDate;
        mTodoColor = 1677725;
        mTodoIdentifier = UUID.randomUUID();
    }

    public ToDoItem(JSONObject jsonObject) throws JSONException {
        mToDoText = jsonObject.getString(TODOTEXT);
        mTodoDesc = jsonObject.getString(TODODESC);
        mHasReminder = jsonObject.getBoolean(TODOREMINDER);
        mTodoColor = jsonObject.getInt(TODOCOLOR);
        mTodoIdentifier = UUID.fromString(jsonObject.getString(TODOIDENTIFIER));

//        if(jsonObject.has(TODOLASTEDITED)){
//            mLastEdited = new Date(jsonObject.getLong(TODOLASTEDITED));
//        }
        if (jsonObject.has(TODODATE)) {
            mToDoDate = new Date(jsonObject.getLong(TODODATE));
        }
        if (jsonObject.has(FROMDODATE)) {
            mFromDoDate = new Date(jsonObject.getLong(FROMDODATE));
        }
    }

    public ToDoItem() {
        this("Clean my room", "why should i clean my room", true, new Date(), new Date());
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(TODOTEXT, mToDoText);
        jsonObject.put(TODODESC, mTodoDesc);
        jsonObject.put(TODOREMINDER, mHasReminder);
//        jsonObject.put(TODOLASTEDITED, mLastEdited.getTime());
        if (mToDoDate != null) {
            jsonObject.put(TODODATE, mToDoDate.getTime());
        }
        if (mFromDoDate != null) {
            jsonObject.put(FROMDODATE, mFromDoDate.getTime());
        }
        jsonObject.put(TODOCOLOR, mTodoColor);
        jsonObject.put(TODOIDENTIFIER, mTodoIdentifier.toString());

        return jsonObject;
    }

    public String getToDoText() {
        return mToDoText;
    }

    public void setToDoText(String mToDoText) {
        this.mToDoText = mToDoText;
    }

    public String getTodoDesc() {
        return mTodoDesc;
    }

    public void setTodoDesc(String mTodoDesc) {
        this.mTodoDesc = mTodoDesc;
    }

    public boolean hasReminder() {
        return mHasReminder;
    }

    public void setHasReminder(boolean mHasReminder) {
        this.mHasReminder = mHasReminder;
    }

    public Date getToDoDate() {
        return mToDoDate;
    }

    public void setToDoDate(Date mToDoDate) {
        this.mToDoDate = mToDoDate;
    }

    public Date getFromDoDate() {
        return mFromDoDate;
    }

    public void setFromDoDate(Date mFromDoDate) {
        this.mFromDoDate = mFromDoDate;
    }

    public int getTodoColor() {
        return mTodoColor;
    }

    public void setTodoColor(int mTodoColor) {
        this.mTodoColor = mTodoColor;
    }

    public UUID getIdentifier() {
        return mTodoIdentifier;
    }
}

