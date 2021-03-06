package jp.goka.favos.model;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.Gson;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by katsuyagoto on 2014/06/19.
 */
public class Comments extends Base {

	private int count;

	private List<Comment> data;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<Comment> getComments() {
		return getMany(Comment.class, "Comments");
	}

	public static Comments parse(JSONObject jsonObject){
		Comments comments = new Gson().fromJson(jsonObject.toString(), Comments.class);
		return comments;
	}

}
