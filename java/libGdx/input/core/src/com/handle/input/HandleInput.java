package com.handle.input;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HandleInput implements ApplicationListener, InputProcessor {
	private SpriteBatch batch;
	private Texture texture;
	private Sprite sprite;
	private float posX, posY;
	
	@Override
	public void create () {
	    float w = Gdx.graphics.getWidth();
	    float h = Gdx.graphics.getHeight();
		batch = new SpriteBatch();
		
		texture = new Texture(Gdx.files.internal("data/0001.png"));
		sprite = new Sprite(texture);
		posX = w/2 - sprite.getWidth()/2;
		posY = h/2 - sprite.getHeight()/2;
		sprite.setPosition(posX, posY);
		
		Gdx.input.setInputProcessor(this);
	}
	
	@Override
	public void dispose() {
	    // TODO Auto-generated method stub
	    batch.dispose();
	    texture.dispose();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		/*if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            if (Gdx.input.isKeyPressed(Input.Keys.CONTROL_LEFT)) {
                sprite.translateX(-1f);
            } else {
                sprite.translateX(-10.0f);
            }
        }
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            if (Gdx.input.isKeyPressed(Input.Keys.CONTROL_LEFT)) {
                sprite.translateX(1f);
            } else {
                sprite.translateX(10.0f);
            }
        }*/
		if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
            sprite.setPosition(Gdx.input.getX() - sprite.getWidth()/2,
                    Gdx.graphics.getHeight() - Gdx.input.getY() - sprite.getHeight()/2);
        }
		if (Gdx.input.isButtonPressed(Input.Buttons.RIGHT)) {
            sprite.setPosition(Gdx.graphics.getWidth()/2 -sprite.getWidth()/2, 
                    Gdx.graphics.getHeight()/2 - sprite.getHeight()/2);
        }
		
		sprite.setPosition(posX, posY);
		
		batch.begin();
		sprite.draw(batch);
		batch.end();
	}
	
	@Override
	public void resize(int width, int height) {
	}
	
	@Override
	public void resume() {
	}
	
	@Override
	public void pause() {
	}

    @Override
    public boolean keyDown(int keycode) {
        float moveAmount = 1.0f;
        if (Gdx.input.isKeyPressed(Keys.CONTROL_LEFT)) {
            moveAmount = 10.0f;
        }
        
        if (keycode == Keys.LEFT) {
            posX -= moveAmount;
        }
        
        if (keycode == Keys.RIGHT) {
            posX += moveAmount;
        }
        
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        if(button == Buttons.LEFT){
            posX = screenX - sprite.getWidth()/2;
            posY = Gdx.graphics.getHeight() - screenY - sprite.getHeight()/2;
        }
        if(button == Buttons.RIGHT){
            posX = Gdx.graphics.getWidth()/2 - sprite.getWidth()/2;
            posY = Gdx.graphics.getHeight()/2 - sprite.getHeight()/2;
        }
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        // TODO Auto-generated method stub
        return false;
    }
	
	
}
